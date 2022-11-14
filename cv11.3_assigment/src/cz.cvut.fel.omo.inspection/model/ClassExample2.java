package cz.cvut.fel.omo.model;

import cz.cvut.fel.omo.inspection.securityAndValidation.Email;
import cz.cvut.fel.omo.inspection.securityAndValidation.NotNull;
import cz.cvut.fel.omo.inspection.securityAndValidation.UiUserRoles;

//@NotNull(message="all attributes can not be null.")
public class ClassExample2{
	//@NotNull(message="attr1 can not be null.")
	@UiUserRoles(role={"ROLE_ADMIN","ROLE_USER"})
	String attr01;
	
	public ClassExample2(){
		this.attr01 = "";
	}
	
}
