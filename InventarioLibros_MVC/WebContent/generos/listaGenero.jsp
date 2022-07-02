<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Lista de generos</title>
<%@ include file='/cabecera.jsp'%>
</head>
<body>
	<jsp:include page="/menu.jsp"/>
	<div class="container">
		<div class="row">
			<h3>Lista de generos</h3>
		</div>
		<div class="row">
			<div class="col-md-10">
				<a type="button" class="btn btn-primary btn-md"
					href="${pageContext.request.contextPath}/generos.do?op=nuevo"> Nuevo genero</a> <br />
				<br />
				<table class="table table-striped table-bordered table-hover"
					id="tabla">
					<thead>
						<tr>
							<th>Nombre del genero</th>
							<th>Descripcion</th>
							<th>Operaciones</th>
					</thead>
					<tbody>

						<c:forEach items="${requestScope.listaGenero}" var="genero">
							<tr>
								
								<td>${genero.nombreGenero}</td>
								<td>${genero.descripcion}</td>
								<td><a class="btn btn-primary"
									href="${pageContext.request.contextPath}/generos.do?op=obtener&id=${genero.idGenero}"><span
										class="glyphicon glyphicon-edit"></span> Editar</a> <a
									class="btn btn-danger"
									href="javascript:eliminar('${genero.idGenero}')"><span
										class="glyphicon glyphicontrash"></span> Eliminar</a></td>
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
			alertify.confirm("¿Realmente decea eliminar este Genero?", function(
					e) {
				if (e) {
					location.href = "generos.do?op=eliminar&id=" + id;
				}
			});
		}
	</script>
</body>
</html>