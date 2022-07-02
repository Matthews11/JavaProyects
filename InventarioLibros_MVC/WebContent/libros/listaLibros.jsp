<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Lista de libros</title>
<%@ include file='/cabecera.jsp'%>
</head>
<body>
	<jsp:include page="/menu.jsp" />
	<div class="container">
		<div class="row">
			<h3>Lista de libros</h3>
		</div>
		<div class="row">
			<div class="col-md-12">
				<a type="button" class="btn btn-primary btn-md"
					href="${pageContext.request.contextPath}/libros.do?op=nuevo"> Nuevo libro</a><br>
				<br>
				<table class="table table-striped table-bordered table-hover"
					id="tabla">
					<thead>
						<tr>
							<th>Codigo del libro</th>
							<th class="col-md-2">Nombre del libro</th>
							<th>Existencias</th>
							<th>Precio</th>
							<th>Genero</th>
							<th>Autor</th>
							<th>Editorial</th>

							<th>Operaciones</th>
						</tr>
					</thead>
					<tbody>

						<c:forEach items="${requestScope.listaLibros}" var="libro">
							<tr>
								<td>${libro.codigoLibro}</td>
								<td>${libro.nombreLibro}</td>
								<td>${libro.existencias}</td>
								<td>$${libro.precio}</td>
								<td>${libro.genero.nombreGenero}</td>
								<td>${libro.autor.nombreAutor}</td>
								<td>${libro.editorial.nombreEditorial}</td>

								<td><a title="detalles" class="btn btn-default"
									href="javascript:detalles('${libro.codigoLibro}')"><span
										class="glyphicon glyphicon-search"></span></a> <a
									title="modificar" class="btn btn-primary"
									href="${pageContext.request.contextPath}/libros.do?op=obtener&id=${libro.codigoLibro}"><span
										class="glyphicon glyphicon-edit"></span></a> <a title="eliminar"
									class="btn btn-danger"
									href="javascript:eliminar('${libro.codigoLibro}')"><span
										class="glyphicon glyphicon-trash"></span></a></td>
							</tr>
						</c:forEach>


					</tbody>
				</table>
			</div>

		</div>
	</div>
	<div class="modal" id="modal" tabindex="-1" role="dialog">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title"></h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<ul class="list-group">
						<li class="list-group-item"><b>Codigo del libro:</b><span
							id="codigo"></span></li>

						<li class="list-group-item"><b>Nombre del libro:</b><span
							id="nombre"></span></li>
						<li class="list-group-item"><b>Existencias del libro:</b>$<span
							id="existencias"></span></li>
						<li class="list-group-item"><b>Precio del libro:</b><span
							id="precio"></span></li>
						<li class="list-group-item"><b>Editorial del libro: </b><span
							id="editorial"></span></li>
						<li class="list-group-item"><b>Autor del libro:</b><span
							id="autor"></span></li>
						<li class="list-group-item"><b>Genero del libro:</b><span
							id="genero"></span></li>
						<li class="list-group-item"><b>Descripcion del libro:</b><span
							id="descripcion"></span></li>
					</ul>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Cerrar</button>

				</div>
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
			alertify.confirm("¿Realmente decea eliminar este editorial?",
					function(e) {
						if (e) {
							location.href = "libros.do?op=eliminar&id=" + id;
						}
					});

		}
		function detalles(id) {
			$
					.ajax({
						url : "${pageContext.request.contextPath}/libros.do?op=detalles&id="
								+ id,
						type : "GET",
						dataType : "JSON",
						success : function(data) {
							$('#codigo').text(data.codigo);
							$('#nombre').text(data.nombre);
							$('#existencias').text(data.existencias);
							$('#precio').text(data.precio);
							$('#editorial').text(data.editorial);
							$('#autor').text(data.autor);
							$('#genero').text(data.genero);
							$('#descripcion').text(data.descripcion);
							$('#modal').modal('show');
						}
					});
		}
	</script>
</body>
</html>
