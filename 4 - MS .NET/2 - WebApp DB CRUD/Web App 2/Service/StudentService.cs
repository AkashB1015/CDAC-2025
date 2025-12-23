using WebAppTest1.DAO;
using WebAppTest1.Models;

namespace WebAppTest1.Service
{
    public class StudentService : IStudentService
    {
        private readonly IStudentDAO studentDAO;

       public StudentService(IStudentDAO studentDAO)
        {
            this.studentDAO = studentDAO;
        }
        public void Add(Student student)
        {
           studentDAO.Add(student);
        }

        public void Delete(int id)
        {
            studentDAO.Delete(id);
        }

        public List<Student> GetAll()
        {
            return studentDAO.GetAll();
        }

        public Student GetById(int id)
        {
            return studentDAO.GetById(id);
        }

        public void Update(Student student)
        {
            studentDAO.Update(student);
        }
    }
}
