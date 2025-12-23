using Microsoft.AspNetCore.Mvc;
using WebAppTest1.Models;
using System.Collections.Generic;
using System.Diagnostics.Contracts;

namespace WebAppTest1.Controllers
{
    public class StudentController : Controller
    {
      
        static List<Student> students = new List<Student>();

        public StudentController()
        {
            if (students.Count == 0)
            {
                students.Add(new Student { Id = 101, Age = 35, Name = "John Doe", Fees = 2500.50 });
                students.Add(new Student { Id = 102, Age = 28, Name = "Alex Smith", Fees = 3000.00 });
                students.Add(new Student { Id = 103, Age = 30, Name = "Emma Brown", Fees = 2800.75 });
            }
        }


        public IActionResult Index()
        {
            ViewBag.Title = "Student List ";
            ViewBag.Message = "Index";
            ViewBag.MyName = " Hi There Users ";
            return View(students);
        }

        // GET: Student/Add
        [HttpGet]
        public IActionResult Add()
        {
            return View();
        }

        // POST: Student/Add
        [HttpPost]
        public IActionResult Add(Student student)
        {
            if (!ModelState.IsValid)  // server side checkign 
            {
                return View(student);
            }
            students.Add(student);
            return RedirectToAction("Index");
        }

        // GET: Student/GetById/101
        public IActionResult GetById(int id)
        {
            Student stu = students.Find(s => s.Id == id);
            return View(stu);
        }

        public string GetMessage()
        {
            return "Hello from Web App !";
        }

        [HttpGet]
        public IActionResult Delete(int id)
        {
            foreach (Student student in students)
            {
                if (student.Id == id)
                {
                    students.Remove(student);
                    break;
                }
            }
            return RedirectToAction("Index");
        }


        [HttpGet]
        public IActionResult Edit(int id)
        {
            Student stu = students.Find(s => s.Id == id);
            return View(stu);
        }


        [HttpPost]
        public IActionResult Edit(Student student)
        {
            foreach (Student st in students)
            {
                if (st.Id == student.Id)
                {
                    st.Name = student.Name;
                    st.Age = student.Age;
                    st.Fees = student.Fees;
                    break;
                }
            }

            return RedirectToAction("Index");
        }









    }
}
