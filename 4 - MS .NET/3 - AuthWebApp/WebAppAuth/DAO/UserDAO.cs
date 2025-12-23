using Microsoft.Data.SqlClient;
using WebAppAuth.Models;

namespace WebAppAuth.DAO
{
    public class UserDAO : IUserDAO
    {
        private readonly string _connectionString;

        public UserDAO(IConfiguration configuration)
        {
            _connectionString = configuration.GetConnectionString("DefaultConnection");
        }

        public void Register(User user)
        {
            using SqlConnection con = new(_connectionString);
            string query = "INSERT INTO Users VALUES (@Username, @Password, @Email, @Role)";

            SqlCommand cmd = new(query, con);
            cmd.Parameters.AddWithValue("@Username", user.Username);
            cmd.Parameters.AddWithValue("@Password", user.Password);
            cmd.Parameters.AddWithValue("@Email", user.Email);
            cmd.Parameters.AddWithValue("@Role", user.Role);

            con.Open();
            cmd.ExecuteNonQuery();
        }

        public User? ValidateUser(string username, string password)
        {
            using SqlConnection con = new(_connectionString);
            string query = "SELECT * FROM Users WHERE Username=@u AND Password=@p";

            SqlCommand cmd = new(query, con);
            cmd.Parameters.AddWithValue("@u", username);
            cmd.Parameters.AddWithValue("@p", password);

            con.Open();
            SqlDataReader reader = cmd.ExecuteReader();

            if (reader.Read())
            {
                return new User
                {
                    Id = (int)reader["Id"],
                    Username = reader["Username"].ToString(),
                    Role = reader["Role"].ToString()
                };
            }
            return null;
        }
    }
}
