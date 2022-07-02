<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Lista de editoriales</title>
<%@ include file='/cabecera.jsp'%>
</head>
<body>
	<jsp:include page="/menu.jsp" />
	<div class="container">
		<div class="row">
			<h3>Lista de editoriales</h3>
		</div>
		<div class="row">
			<div class="col-md-10">
				<a type="button" class="btn btn-primary btn-md" href="${pageContext.request.contextPath}/editoriales.do?op=nuevo"> Nuevo editorial</a> <br/>
				<br/>
				<table class="table table-striped table-bordered table-hover" id="tabla">
					<thead>
						<tr>
							<th>Codigo del editorial</th>
							<th>Nombre del editorial</th>
							<th>Contacto</th>
							<th>Telefono</th>
						</tr>
					</thead>
					<tbody>

						<c:forEach items="${requestScope.listaEditorial}" var="editorial">
							<tr>
								<td>${editorial.codigoEditorial}</td>
								<td>${editorial.nombreEditorial}</td>
								<td>${editorial.contacto}</td>
								<td>${editorial.telefono}</td>
								<td><a class="btn btn-primary" 	href="${pageContext.request.contextPath}/editoriales.do?op=obtener&id=${editorial.codigoEditorial}"><span class="glyphicon glyphicon-edit"></span> Editar</a>
								<a class="btn btn-danger" href="javascript:eliminar('${editorial.codigoEditorial}')"><span class="glyphicon glyphicontrash"></span> Eliminar</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>

		</div>
	</div>
	<script>
		$(document).ready(function() {
			$('#tabla').DataTable();
		});
		<c:if test="${not empty exito}">
		alertify.success('${exito}');
		<c:set var="exito" value="" scope="session" />
		</c:if>
		<c:if test="${not empty fracaso}">
		alertify.error('${fracaso}');
		<c:set var="fracaso" value="" scope="session" />
		</c:if>
		
		function eliminar(id) {
			alertify.confirm("¿Realmente desea eliminar este Editorial?", function(
					e) {
				if (e) {
					location.href = "editoriales.do?op=eliminar&id=" + id;
				}
			});
		}
	</script>
</body>
</html>