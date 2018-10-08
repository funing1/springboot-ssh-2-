package com.springbbot.action;

import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.springbbot.domain.Test;
import com.springbbot.serveice.TestService;

import net.sf.json.JSONArray;

@Controller
@Scope("prototype")
@ParentPackage("struts-default")
@Namespace(value = "/Test")
public class TestAaction extends ActionSupport implements ModelDriven<Test> {

	private Test test = new Test();

	@Autowired
	private TestService testService;

	@Action(value = "test", results = {
			@org.apache.struts2.convention.annotation.Result(name = "success", location = "/test.jsp", type = "redirect") })

	public String home() throws Exception {

		return SUCCESS;
	}

	@Action(value = "findAllTest", results = {
			@org.apache.struts2.convention.annotation.Result(name = "success", location = "/test.jsp", type = "redirect") })
	public String findAllTest() throws Exception {


		List<Test> findAll = testService.findAll();

		Map<String, Object> session = ActionContext.getContext().getSession();
		
		session.put("list", findAll);

		return SUCCESS;
	}

	@Override
	public Test getModel() {
		// TODO Auto-generated method stub
		return this.test;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

}
