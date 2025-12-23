using Microsoft.AspNetCore.Mvc;

namespace WepAppDemo2.Controllers
{
    public class TeacherController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }

        public IActionResult Create()
        {
                return View();
        }
    }
}
