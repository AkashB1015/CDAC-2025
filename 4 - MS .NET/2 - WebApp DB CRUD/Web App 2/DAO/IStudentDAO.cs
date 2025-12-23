using WebAppTest1.Models;

namespace WebAppTest1.DAO
{
    public interface IStudentDAO
    {
        public List<Student> GetAll();
        public void Add(Student student);
        public void Update(Student student);
        public void Delete(int id);
        public Student GetById(int id);
    }
}
