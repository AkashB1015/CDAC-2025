using WebAppTest1.Models;
using WepAppDemo2.Models;
using Microsoft.Data.SqlClient;
namespace WepAppDemo2.DAO
{
    public class StudentDAO : IStudentDAO
    {

        private readonly string myconn;

        public StudentDAO(IConfiguration Configuration)
        {

           myconn = Configuration.GetConnectionString("DefaultConnection");

        }

        public void Add(Student student)
        {
            throw new NotImplementedException();
        }

        public void Delete(int id)
        {
            throw new NotImplementedException();
        }

        public List<Student> GetAll()
        {
            List<Student> students = new List<Student>();
            SqlConnection conn = new (myconn);
            SqlCommand cmd = new SqlCommand("SELECT * FROM Students",conn);
              
            conn.Open();
            SqlDataReader dr = cmd.ExecuteReader();

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
            throw new NotImplementedException();
        }

        public void Update(Student student)
        {
            throw new NotImplementedException();
        }

    }
}
