<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>modifyCategory</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<style type="text/css"><!--注释1 -->
	#error{font-size: 12px;color: red}

</style>

<Script><!--注释2 -->
	function Check() {

		if (document.form1.categoryName.value == "") {
			var error =document.getElementById("error");
			error.innerText="图书类别不能修改为空，请输入类别";
			document.form1.categoryName.focus();
			return false;
		}
		return true;
	}
</Script>
</head>
<body>
	<center>
		<table>
			<tr>
				<td colspan=2>
				<jsp:include page="../../common/head.jsp">
					<jsp:param value="admin" name="type"/>
				</jsp:include>
				</td>
			</tr> 
			<tr>
				<td><%@include file="../../common/adminMenu.jsp"%>
				</td>
				<td align="center">
					<%  request.setCharacterEncoding("UTF-8");
						String categoryId = request.getParameter("categoryId");
						String categoryName = new String(request.getParameter("categoryName").getBytes("iso8859-1"),"UTF-8");
						String errorMessage = (String)request.getAttribute("Error");
						%>
					<form name="form1" onSubmit="return Check()"
						action="doModifyCategory.jsp?categoryId=<%=categoryId%>"
						method="post">
						<table width="400">
							<tr>
								<td height="30" align="center" colspan="2">修改图书类别</td>
							</tr>
							<tr >
								<td bgcolor="#008B8B" width="100%" height="5" colspan="2"></td>
							</tr>
							<tr>
								<td  id="error"  colspan="2"><% if(errorMessage!=null){ %>
									<%=errorMessage %>
									<% }%></td>
							</tr>
							<tr>
								<td width="40%" height="30" align="center">图书类别:</td>
								<td width="60%" height="30">
								<input type="text"	name="categoryName" size="20" value="<%=categoryName%>"></input>
								</td>
								
							</tr>
							<tr>
							<td align="center"><input type="submit" value="修改"></td>
							<td><input type="reset" value="重置" name="reset"></td>
							</tr>
						</table>
					</form>
				</td>
			</tr>
			<tr>
				<td align="center" colspan=2><%@include
						file="../../common/bottom.jsp"%></td>
			</tr>
		</table>
	</center>
</body>