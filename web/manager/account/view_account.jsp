<%@page import="com.main.servlet.IServletConstant"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12">
            <div class="widget-box">
                <div class="widget-title"> <span class="icon"> <i class="icon-money"></i> </span>
                    <h5>CLIENT ACCOUNT TALLY</h5>
                </div>
                <div class="widget-content nopadding">
                    <form class="form-horizontal" method="post" action="../AccountServlet" name="basic_validate" id="basic_validate" novalidate="novalidate">
                        <div class="control-group">
                            <label class="control-label ">CLIENT NAME :</label>
                            <div class="controls">
                                <select class="span11" name="client_id">  </select>
                            </div>
                            <div class="controls">
                                <input type="hidden" name="<%= IServletConstant.ACTION%>" value="<%= IServletConstant.ACTION_SEARCH%>" />
                                <button type="submit" class="btn btn-info">SEARCH</button>
                            </div>
                        </div>
                    </form>
                    <div class="row-fluid">
                        <div class="span12">
                            <div class="widget-content nopadding">
                                <table class="table table-bordered table-striped" style="border-top: solid 1px rgb(220,220,220);text-transform: capitalize">
                                    <thead>
                                        <tr>
                                            <th style="width: 1%">#</th>
                                            <th style="width: 1%">#</th>
                                            <th>CLIENT NAME</th>
                                            <th>ORDER ID</th>
                                            <th>CREDIT </th>
                                            <th>DEBIT</th>
                                            <th>DATE</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="account" items="${pageScope.tblAccounts}"> 
                                            <tr>
                                                <td><a href="../<%=IServletConstant.PAGE_ADD_ACCOUNT%>&id=${account.accountId}"><i class="icon-pencil"></i></a></td>
                                                <td><a href="../<%=IServletConstant.PAGE_DELETE_ACCOUNT%>&clientId=${client.clientId}"><i class="icon-remove"></i></a></td>
                                                <td>
                                                    <c:out value="${account.tblClient.clientName}"/> 
                                                </td>
                                                <td>
                                                    <c:out value="${account.tblOrder.tblGsm.gsmName}"/>- 
                                                    <c:out value="${account.tblOrder.tblPrinting.printingName}"/>- 
                                                    <c:out value="${account.tblOrder.tblQty.qtyName}"/>- 
                                                    <c:out value="${account.tblOrder.tblSides.sideName}"/>- 
                                                    <c:out value="${account.tblOrder.tblPaper.paperName}"/> 
                                                </td>
                                                <td><c:out value="${account.credited}"/> </td>
                                                <td><c:out value="${account.debited}"/> </td>
                                                <td><c:out value="${account.accountAddedDate}"/> </td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                    <thead>
                                        <tr style="font-size: 14px;font-weight: bold">
                                            <td colspan="4"></td>
                                            <td>1000/-</td>
                                            <td>1000/-</th>
                                            <td></td>
                                        </tr>
                                    </thead>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>   