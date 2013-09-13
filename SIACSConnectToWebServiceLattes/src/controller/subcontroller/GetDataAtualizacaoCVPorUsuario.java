package controller.subcontroller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.SIACS;
import model.form.GetDataAtualizacaoCVPorUsuarioForm;
import model.util.Mensagem;

import controller.AbstractCommand;

public class GetDataAtualizacaoCVPorUsuario extends AbstractCommand {
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		SIACS siacs = SIACS.getInstance();
		
		String page = (String) request.getParameter("page");
		String frm_id = request.getParameter("frm_id");
		String frm_login = request.getParameter("frm_login");
		
		GetDataAtualizacaoCVPorUsuarioForm gDACVPUForm = new GetDataAtualizacaoCVPorUsuarioForm();
		gDACVPUForm.setId(frm_id);
		gDACVPUForm.setLogin(frm_login);
		
		String retornoString = siacs.getDataAtualizacaoCVPorUsuario(gDACVPUForm);
		
		request.setAttribute("retornoString", retornoString);
		request.setAttribute("retorno", Mensagem.getErroAtual());
		request.getRequestDispatcher(page).forward(request, response);
	}

}
