
package org.unitec.finalheroku;

import java.lang.reflect.Method;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControladorMensajes {
    
    @RequestMapping(value="/mensajito",method=RequestMethod.GET,
            headers={"Accepst=application/json"})
   
 public Mensajito hola(){
 Mensajito mensa= new Mensajito("hola","Me asustan");
 
 return mensa;
 }   
    
}
