using Microsoft.AspNetCore.Mvc;
using WebAppAuth.DAO;
using WebAppAuth.Models;

namespace WebAppAuth.Controllers
{
    public class AccountController : Controller
    {
        private readonly IUserDAO userDAO;

        public AccountController(IUserDAO userDAO)
        {
            this.userDAO = userDAO;
        }

       
        [HttpGet]
        public IActionResult Register()
        {
            return View();
        }

        [HttpPost]
        public IActionResult Register(User user)
        {
            user.Role = "User";

            if (ModelState.IsValid)
            {
                userDAO.Register(user);
                TempData["Success"] = "Registration successful";
                return RedirectToAction("Login");
            }
            return View(user);
        }

        [HttpGet]
        public IActionResult Login()
        {
            return View();
        }

        [HttpPost]
        public IActionResult Login(string username, string password)
        {
            var user = userDAO.ValidateUser(username, password);

            if (user != null)
            {
                HttpContext.Session.SetString("UserName", user.Username);
                HttpContext.Session.SetString("UserRole", user.Role);

                return RedirectToAction("Dashboard");
            }

            ViewBag.Error = "Invalid credentials";
            return View();
        }

        public IActionResult Dashboard()
        {
            var role = HttpContext.Session.GetString("UserRole");

            if (role == null)
            {
                return RedirectToAction("Login");
            }

            if (role == "Admin")
            {
                return RedirectToAction("AdminDashboard");
            }

            return RedirectToAction("UserDashboard");
        }

     
        [HttpGet]
        public IActionResult AdminDashboard()
        {
            var role = HttpContext.Session.GetString("UserRole");

            if (role != "Admin")
            {
                return RedirectToAction("Login");
            }

            return View();
        }

       
        [HttpGet]
        public IActionResult UserDashboard()
        {
            var role = HttpContext.Session.GetString("UserRole");

            if (role == null)
            {
                return RedirectToAction("Login");
            }

            return View();
        }

        public IActionResult Logout()
        {
            HttpContext.Session.Clear();
            return RedirectToAction("Login");
        }
    }
}
