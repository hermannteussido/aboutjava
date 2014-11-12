<%@ page isELIgnored="false" %>
<!DOCTYPE HTML>
<html>
<head>
  <meta charset="utf-8">
  <title>Process Page</title>
</head>
<body>
<p>
  Thank you for your information. Your hobby of
  <strong>${helper.data.hobby}</strong> and aversion of
  <strong>${helper.data.aversion}</strong> will be added to
  our records, eventually.
</p>

<form action="Controller">
  <input type="hidden" name="hobby" value="${helper.data.hobby}">
  <input type="hidden" name="aversion" value="${helper.data.aversion}">
  <input type="submit" name="editButton" value="Edit">
</form>
</body>
</html>

