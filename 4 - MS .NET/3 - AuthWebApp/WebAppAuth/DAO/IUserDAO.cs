using WebAppAuth.Models;

namespace WebAppAuth.DAO
{
    public interface IUserDAO
    {
        void Register(User user);
        User? ValidateUser(string username, string password);
    }
}
