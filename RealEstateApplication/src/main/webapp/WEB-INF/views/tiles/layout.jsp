<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
	<link rel="stylesheet" href="resources/css/style_index.css" 
      type="text/css" media="screen, projection"></link>
</head>
<body>
<table border="0" cellpadding="2" cellspacing="1" align="center">
    <tr>
        <td height="30"><tiles:insertAttribute name="header" />
        </td>
    </tr>
    <tr>
        <td width="960"><tiles:insertAttribute name="body" /></td>
    </tr>
    <tr>
        <td height="30"><tiles:insertAttribute name="footer" />
        </td>
    </tr>
</table>
</body>
</html>