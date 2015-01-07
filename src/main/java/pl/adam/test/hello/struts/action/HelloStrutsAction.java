package pl.adam.test.hello.struts.action;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import pl.adam.test.hello.struts.form.HelloStrutsForm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: alipinski
 * @version:
 * @since: 2015-01-07
 */
public class HelloStrutsAction extends Action {
	public ActionForward execute(ActionMapping mapping,ActionForm form,
	                             HttpServletRequest request,HttpServletResponse response)
			throws Exception {

		HelloStrutsForm helloWorldForm = (HelloStrutsForm) form;
		helloWorldForm.setMessage("Hello Struts!!");

		return mapping.findForward("success");
	}
}
