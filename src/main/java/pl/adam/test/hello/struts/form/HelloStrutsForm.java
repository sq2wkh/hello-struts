package pl.adam.test.hello.struts.form;

import org.apache.struts.action.ActionForm;

/**
 * @author: alipinski
 * @version:
 * @since: 2015-01-07
 */
public class HelloStrutsForm extends ActionForm {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
