package ec.edu.ups.validations;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("vnumero")
public class ValidacionNumerico implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		String cadena = value.toString().trim();

		if (cadena.length() == 0 || cadena == null) {
			throw new ValidatorException(new FacesMessage("*Campo Obligatorio"));
		}

		else {		
			for (int i = 0; i < cadena.length(); i++) {
			      if (!Character.isDigit(cadena.charAt(i)))
			    	  throw new ValidatorException(new FacesMessage("Ingrese solo Numeros"));
			    }
			}
			
		}

}
