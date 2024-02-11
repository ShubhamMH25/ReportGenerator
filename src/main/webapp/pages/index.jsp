<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Report App</title>
  
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <!-- Add bootstrap CDN link -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
 <style>
  body {
    background-image: url('life-insurance-concept-with-paper-family');
    /* Other background properties (repeat, size, etc.) can be added here */
  }
</style>
</head>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.min.css"/>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.bundle.min.js"></script>
    <!-- Use the container-fluid class to make the page use the full width -->
    <div class="container-fluid" > 
    <!-- Use a jumbotron component to create a large and bold introduction -->
    <div class="jumbotron">
    <h1 class="display-4 text-center">Report Application</h1>
    <p class="lead text-center">This is a simple report application that allows you to search and view some plans based on some criteria.</p>
    </div>
   
   <!-- Use a card component to wrap the form inputs -->
   <div class="card">
   <!-- Use a card-header to display the title of the form -->
   <div class="card-header">
   <h3 class="card-title text-center">Search Form</h3>
   </div>
   <!-- Use a card-body to contain the form inputs -->
   <div class="card-body">
   <form:form action="search" modelAttribute="search" method="post" class="form-horizontal">
   
   <div class="row">
   <div class="col-md-4 form-group">
   <form:label path="planName" class="form-label">Plan Name</form:label>
   <form:select path="planName" class="form-select">
   <form:option value="">-Select</form:option>
   <form:options items="${names}"/>
    </form:select>
    </div>
    
    <div class="col-md-4 form-group">
   <form:label path="planStatus" class="form-label">Plan Status</form:label>
   <form:select path="planStatus" class="form-select">
   <form:option value="">-Select</form:option>
   <form:options items="${status}"/>
   </form:select>
    </div>
    
   <div class="col-md-4 form-group">
   <form:label path="gender" class="form-label">Gender</form:label>
   <form:select path="gender" class="form-select">
   <form:option value="">-Select</form:option>
   <form:option value="Male">Male</form:option>
   <form:option value="Female">Female</form:option>
   </form:select></div>  
   </div>
   
  <div class="row">
  <div class="col-md-6 form-group">
  <form:label path="startDate" class="form-label">Start Date</form:label>
 <form:input path="startDate" class="form-control datepicker" data-date-format="dd/mm/yyyy"/> 
 </div>
 
 <div class="col-md-6 form-group">
  <form:label path="endDate" class="form-label">End Date</form:label>
 <form:input path="endDate" class="form-control datepicker" data-date-format="dd/mm/yyyy"/> 
 </div>
 </div>
   
   <!-- Add a closing tag for the table row element -->
   <tr>
   <td><a href="/" class="btn btn-warning">Reset</a>
   <!-- Use the btn-outline-primary class to make the button have a transparent background and a blue border -->
   <td><input type="submit" value="search"class="btn btn-secondary"/></td>
   </tr>
   </form:form>
   </div>
   
   </div>
   <hr>
   <!-- Use the table-bordered and table-hover classes to add borders and hover effects to the table -->
<table  class="table table-striped table-bordered table-hover">
<thead class="table-light">
<tr>
<th>ID</th>
<th>Holder Name</th>
<th>Plan Name</th>
<th>PlanStatus</th>
<th>Gender</th>
<th>StartDate</th>
<th>EndDate</th>
<th>BenfitAmt</th>
<th>DenialReason</th>
<th>TerminationDate</th>
<th>TerminationRes</th>
</tr>
</thead>
<tbody>
<!-- Fix the typo in the c:forEach tag -->
<c:forEach items="${plans}" var="plan" >
<tr>
<td>${plan.citizenId}</td>
<td>${plan.citizenName}</td>
<td>${plan.planName}</td>
<td>${plan.planStatus}</td>
<td>${plan.gender}</td>
<td>${plan.planStrtDate}</td>
<td>${plan.planEndDate}</td>
<td>${plan.benefitAmt}</td>
<td>${plan.denialReason}</td>
<td>${plan.terminationDate}</td>
<td>${plan.terminationRes}</td>
</c:forEach>
<tr>
 <c:if test="${empty plans}">
        <td colspan="11" style="text-align: center;">NO RECORD FOUND</td>
    </c:if>
</tr>
</tbody>
</table>
<hr>
<!-- Use a card-footer to display the export links -->
   <div class="card-footer">
   <!-- Use the alert-link class to make the export links look like alert messages -->
   Export :<a href="" class="link-opacity-75" >Excel</a><a href="" class="alert-link">PDF</a>
   </div>
    </div>
    
   <!-- Add a closing tag for the last div element in the container -->
   </div>
   
</body>
<script>
$(document).ready(function(){
  $('.datepicker').datepicker();
});
</script>
<!-- Add a closing tag for the html element -->
</html>
