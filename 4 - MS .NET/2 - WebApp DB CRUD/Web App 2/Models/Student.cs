using System.ComponentModel.DataAnnotations;

namespace WebAppTest1.Models
{
    public class Student
    {
        public int Id { get; set; }
        [Required(ErrorMessage = " Name field is required")]
        [MinLength(10, ErrorMessage = "Name must be more than 10 character")]
        [MaxLength(200, ErrorMessage = "Name must be less than 200 character")]
        [RegularExpression(@"^[A-Za-z ]+$", ErrorMessage = "Name can have alphabets and spaces only")]
        public string Name { get; set; }
        [Required(ErrorMessage = "Age field is required")]
        [Range(1,120, ErrorMessage = "Age must be in between 1 to 120")]
        public int Age { get; set; }
        public double Fees { get; set; }
    }
}
