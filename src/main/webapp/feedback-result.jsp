<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Feedback Submitted</title>
</head>
<body>

<h2>Feedback received successfully</h2>


<p><strong>Email:</strong> ${email}</p>
<p><strong>Phone:</strong> ${phone}</p>
<p><strong>Message:</strong> ${feedbackMessage}</p>


<a href="<%= application.getContextPath() %>/feedback.jsp">
    Submit another feedback
</a>

</body>
</html>
