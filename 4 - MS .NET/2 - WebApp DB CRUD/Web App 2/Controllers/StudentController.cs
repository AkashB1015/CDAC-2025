using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;
using WebAppTest1.Models;
using WebAppTest1.Service;


namespace WebAppTest1.Controllers
{
   
    public class StudentController : Controller
    {
        private readonly IStudentService studentService;

        public StudentController(IStudentService studentService) 
        {
            this.studentService = studentService;
        }
        
        [HttpGet]
        public IActionResult Index()
        {
            ViewBag.Title = "Student List";
            ViewBag.Message = "Index";
            ViewBag.MyName = " Akash ";
            ViewBag.ListOfTeacher = new List<Teacher>();
            
            return View(studentService.GetAll());
        }
        //[HttpGet]
        //public string GetMessage()
        //{
        //    return "Hello WebAPP";
        //}
        [HttpGet]
        public IActionResult Add()
        {
            return View();
        }
        [HttpPost]
        public IActionResult Add(Student student)
        {
            if (!ModelState.IsValid) //Sever Side check
            {
                return View(student);
            }
            //students.Add(student);
            studentService.Add(student);
            return RedirectToAction("Index");
        }

        [HttpGet("/getid")]
        public IActionResult GetById(int id)
        {
          //  Student stu = students.Find(s => s.Id == id);s
            return View(studentService.GetById(id));
        }
        [HttpGet("/delete")]
        public IActionResult Delete(int id)
        {

            return View(studentService.GetById(id));
        }
        [HttpPost]
        public IActionResult DeleteConfirm(int id)
        {
            studentService.Delete(id);
            return RedirectToAction("Index");
        }
        [HttpGet]
        public IActionResult Edit(int id)
        {
           // Student stu = students.Find(s => s.Id == id);  //In case of students object in Controller class
            return View(studentService.GetById(id));
        }
        [HttpPost]
        public IActionResult Edit(Student student)
        {
            //foreach (Student st in students)
            //{
            //    if (st.Id == student.Id)
            //    {
            //        st.Name = student.Name;
            //        st.Age = student.Age;
            //        st.Fees = student.Fees;
            //        break;
            //    }
            //}
            if (!ModelState.IsValid) //Sever Side check
            {
                return View(student);
            }
            studentService.Update(student);
            return RedirectToAction("Index");
        }
    }
}
