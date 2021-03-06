
<%@page import="com.main.servlet.IServletConstant" %>

<%
    Object idrequest = request.getParameter("id");
    if (idrequest != null) {
        pageContext.setAttribute("btnValue", "Edit");
        pageContext.setAttribute("btnClass", "btn btn-info");
        pageContext.setAttribute("actionvalue", IServletConstant.ACTION_UPDATE);
        pageContext.setAttribute("headerTitle", "UPDATE NEW ALGORITHM ");
    } else {
        pageContext.setAttribute("btnValue", "Save");
        pageContext.setAttribute("btnClass", "btn btn-success");
        pageContext.setAttribute("actionvalue", IServletConstant.ACTION_ADD);
        pageContext.setAttribute("headerTitle", "ADD NEW ALGORITHM");
    }
%>


<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12">
            <div class="widget-box">
                <div class="widget-title"> <span class="icon"> <i class="icon-user"></i></span><h5 style="color: green">${headerTitle}</h5></div>
                <div class="widget-content nopadding">
                    <form class="form-horizontal" method="post" action="../ClientServlet" name="basic_validate" id="basic_validate" novalidate="novalidate">
                        <div class="control-group" style="background-color: white;">
                            <div class="span11" style="clear: both "></div>
                            <div class="span11">
                                <div class="span6"  style="float: left">
                                    <label class="control-label ">CLIENT&nbspNAME&nbsp;:&nbsp;</label>
                                    <div class="controls">
                                        <input type="text" name="propriter_name" autofocus="" value="${tblClient.propriterName}" maxlength="100" class="span12"  required="" placeholder="PROPRITER NAME" />
                                    </div>
                                </div>
                                <div class="span6"  style="float: left">
                                    <label class="control-label ">FIRM&nbspNAME&nbsp;:&nbsp;</label>
                                    <div class="controls">
                                        <input type="text" name="firm_name"  value="${tblClient.firmName}"  maxlength="100" class="span12"  required="" placeholder="FIRM NAME" />
                                    </div>
                                </div>
                            </div>
                            <div class="span11">
                                <div class="span6"  style="float: left">
                                    <label class="control-label ">E&nbsp;MAIL&nbsp;ID&nbsp;:&nbsp;</label>
                                    <div class="controls">
                                        <input type="text" name="emailId" value="${tblClient.emailId}" maxlength="30" class="span12"   placeholder="E MAIL ID" />
                                    </div>
                                </div>
                                <div class="span6"  style="float: left">
                                    <label class="control-label ">MOBILE&nbspNO&nbsp;:&nbsp;</label>
                                    <div class="controls">
                                        <input type="text" name="mobile_no"  onKeyPress="return isNumberKey(event)" value="${tblClient.mobileNo}" maxlength="10" minlength="10" class="span12"  required="" placeholder="MOBILE NO" />
                                    </div>
                                </div>
                            </div>
                            <div class="span11">
                                <div class="span6"  style="float: left">
                                    <label class="control-label ">PHONE&nbspNO&nbsp1&nbsp;:&nbsp;</label>
                                    <div class="controls">
                                        <input type="text" name="phone_no_1"  onKeyPress="return isNumberKey(event)" value="${tblClient.phoneNo1}" maxlength="20" minlength="8"  class="span12"   placeholder="PHONE NO 1" />
                                    </div>
                                </div>
                                <div class="span6"  style="float: left">
                                    <label class="control-label ">CITY&nbspNAME&nbsp;:&nbsp;</label>
                                    <div class="controls">
                                        <select class="span12">
                                            <c:forEach var="city" items="${pageScope.cities}">
                                                <option value="${city.cityName}">${city.cityName}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <div class="span11">
                                <div class="span6"  style="float: left">
                                    <label class="control-label ">DISTRICT&nbspNAME&nbsp;:&nbsp;</label>
                                    <div class="controls">
                                        <select class="span12">
                                            <c:forEach var="district" items="${pageScope.tblDistrict}">
                                                <option value="${district.districtName}">${district.districtName}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                </div>
                                <div class="span6"  style="float: left">
                                    <label class="control-label ">STATE&nbspNAME&nbsp;:&nbsp;</label>
                                    <div class="controls">
                                        <select class="span12"  name="txtTechnologyName" id="txtTechnologyName">
                                           <option value="-1"> -- PLEASE SELECT -- </option><option value="JAVA">JAVA</option><option value="PHP">PHP</option><option value="MATLAB">MATLAB</option><option value="NS-2">NS-2</option><option value="NS-3">NS-3</option><option value="AWT">AWT</option><option value="SWING">SWING</option><option value="JSP">JSP</option><option value="HTML">HTML</option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <div class="span11">
                                <div class="span12"  >
                                    <label class="control-label ">FULL&nbspADDRESS&nbsp;:&nbsp;</label>
                                    <div class="controls">
                                        <input type="text" name="client_address" value="${tblClient.clientAddress}" maxlength="21845" class="span12"  required="" placeholder="CLIENT ADDRESS" />
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="control-group">
                            <center>
                                <div class="form-actions right">
                                    <input type="hidden" name="<%= IServletConstant.ACTION%>" value="${actionvalue}" />
                                    <input type="hidden" name="<%= IServletConstant.HIDDEN_ID%>" value="${tblClient.clientId}" />
                                    <button type="submit" class="${btnClass}">${btnValue}</button>
                                    <button type="reset" class="btn btn-primary">RESET</button>
                                    <a href="../<%= IServletConstant.PAGE_VIEW_ALGORITHM%>"><button type="button" class="btn btn-info">VIEW ALGORITHM</button></a>
                                </div>
                            </center>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>