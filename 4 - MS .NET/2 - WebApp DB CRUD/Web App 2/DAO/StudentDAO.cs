using Microsoft.Data.SqlClient;
using WebAppTest1.Models;

namespace WebAppTest1.DAO
{
    public class StudentDAO : IStudentDAO
    {
        private readonly string myconn;

        public StudentDAO(IConfiguration configuration)
        {
            myconn=configuration.GetConnectionString("DefaultConnection");
        }

        public void Add(Student student)
        {
            SqlConnection conn = new(myconn);

            SqlCommand cmd = new SqlCommand("INSERT INTO Students VALUES (@id,@name,@age,@fees)", conn);

            cmd.Parameters.AddWithValue("@id", student.Id);
            cmd.Parameters.AddWithValue("@name", student.Name);
            cmd.Parameters.AddWithValue("@age", student.Age);
            cmd.Parameters.AddWithValue("@fees", student.Fees);

            conn.Open();

            cmd.ExecuteNonQuery();
        }

        public void Delete(int id)
        {
            SqlConnection conn = new(myconn);
            SqlCommand cmd = new SqlCommand("DELETE from Students where Id=@id", conn);
            cmd.Parameters.AddWithValue("@id", id);
            conn.Open();
            cmd.ExecuteNonQuery();
        }

        //public async Task<List<STudent>>

        public List<Student> GetAll()
        {
            List<Student> students = new List<Student>();

            SqlConnection conn = new(myconn);

            SqlCommand cmd = new SqlCommand("Select * from Students", conn);
            conn.Open();

            SqlDataReader dr=cmd.ExecuteReader();        //Incase of multiple rows are returning back
            while (dr.Read())
            {
                students.Add(new Student { Id = Convert.ToInt32(dr["Id"]),
                                           Name = dr["Name"].ToString(),
                                           Age = Convert.ToInt32(dr["Age"]),
                                           Fees = Convert.ToDouble(dr["Fees"])
                                            });
            }


            return students;
        }

        public Student GetById(int id)
        {
            Student student = null;

            SqlConnection conn = new(myconn);

            SqlCommand cmd = new SqlCommand("Select * from Students where Id=@id", conn);
            cmd.Parameters.AddWithValue("@id", id);
            conn.Open();
            SqlDataReader dr = cmd.ExecuteReader();

            if (dr.Read())
            {
                student=new Student
                {
                    Id = Convert.ToInt32(dr["Id"]),
                    Name = dr["Name"].ToString(),
                    Age = Convert.ToInt32(dr["Age"]),
                    Fees = Convert.ToDouble(dr["Fees"])
                };
            }
            return student;
        }

        public void Update(Student student)
        {
            SqlConnection conn = new(myconn);

            SqlCommand cmd = new SqlCommand("UPDATE Students SET Name = @name, Age = @age , Fees = @fees where Id = @id", conn);

            cmd.Parameters.AddWithValue("@id", student.Id);
            cmd.Parameters.AddWithValue("@name", student.Name);
            cmd.Parameters.AddWithValue("@age", student.Age);
            cmd.Parameters.AddWithValue("@fees", student.Fees);

            conn.Open();

            cmd.ExecuteNonQuery();      //blocking Sequential Call
            cmd.ExecuteNonQueryAsync();       //Non Blocking Paralell call
        }
    }
}
