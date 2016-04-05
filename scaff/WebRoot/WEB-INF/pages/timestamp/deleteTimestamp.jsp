<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.timestamp-resources"/>
<html>
<head>
<title>View <fmt:message key="timestamp.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="timestamp.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexTimestamp"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="timestamp.id.title"/>:
						</td>
						<td>
							${timestamp.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="timestamp.logindate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${timestamp.loginDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="timestamp.logoutdate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${timestamp.logoutDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="timestamp.createdate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${timestamp.createDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="timestamp.updatedate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${timestamp.updateDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="timestamp.isactive.title"/>:
						</td>
						<td>
							${timestamp.isActive}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/deleteTimestamp?idKey=${timestamp.id}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>