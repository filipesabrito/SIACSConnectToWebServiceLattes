<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="model.util.Mensagem"%>     

<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>getCurriculoCompactadoPorUsuario</title>
</head>

<body>

<form name="getCurriculoCompactadoPorUsuario" method="post" action="/SIACSConnectToWebServiceLattes/SIACSServlet">
	Id:<br>
	<input type="text" name="frm_id"><br>

	Login:<br>
	<input type="text" name="frm_login"><br>

	<input type="submit" name="Submit" value="Enviar" />
	<input type="hidden" name="cmd" value="GetCurriculoCompactadoPorUsuario" />
    <input type="hidden" name="page" value="operacoes/getcurriculocompactadoporusuario.jsp" />	
</form>
<br/>
 <% 	Integer retornoInteger = (Integer)request.getAttribute("retorno"); 
		if(retornoInteger != null){
			int retorno = retornoInteger.intValue();
			if(retorno != Mensagem.SEM_ERRO)
				out.println(Mensagem.getMensagem(retorno));
		}
		
%>

</body>
</html>