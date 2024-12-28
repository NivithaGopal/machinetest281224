<%@ page import="dao.AddDAO" %>
<%@ page import="bean.*" %>

<%
    String name = request.getParameter("name");
    String ageStr = request.getParameter("age");
    String major = request.getParameter("major");
    String year = request.getParameter("year");

    boolean isAdded = false;
    String errorMessage = "";

    try {
       
        int age = Integer.parseInt(ageStr);

        StudentBean studentBean = new StudentBean();
        studentBean.setName(name.trim());
        studentBean.setAge(age);
        studentBean.setMajor(major.trim());
        studentBean.setYear(year.trim());

    
        AddDAO studentDAO = new AddDAO();
        isAdded = studentDAO.addStudent(studentBean);

    } catch (NumberFormatException e) {
        errorMessage = "Invalid age format. Please enter a valid number.";
    } catch (Exception e) {
        errorMessage = "An error occurred: " + e.getMessage();
    }

    if (isAdded) {
        out.print("<script>alert('Student added successfully.');</script>");
        response.sendRedirect("index.jsp");
    } else {
        if (errorMessage.isEmpty()) {
            errorMessage = "Failed to add student.";
        }
        out.print("<script>alert('" + errorMessage + "');</script>");
        response.sendRedirect("add.jsp");
    }
%>
