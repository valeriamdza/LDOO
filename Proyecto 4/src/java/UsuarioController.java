import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("/LoginController")
public class UsuarioController{

   @RequestMapping(value = "/usuario", method = RequestMethod.GET)
   public ModelAndView usuario() {
      return new ModelAndView("usuario", "command", new Usuario());
   }
   
   @RequestMapping(value = "/addUsuario", method = RequestMethod.POST)
   public String addUsuario(@ModelAttribute("SpringWeb")Usuario usuario, 
   ModelMap model) {
      model.addAttribute("nombre", usuario.getNombre());
      model.addAttribute("edad", usuario.getFecha());
      model.addAttribute("correo", usuario.getCorreo());
      model.addAttribute("contra", usuario.getContra());
      
      
      return "result";
   }
}