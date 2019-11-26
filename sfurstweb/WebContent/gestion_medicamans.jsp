<%@page import="web.MedicamentBeans"%>
<%@page import="metier.Medicament"%>
<%@page import="metier.Operation"%>
<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css" media="all"/>
<title>::Gestion De Medicaments::</title>
</head>
<body>
 <%
  MedicamentBeans mbs;
  if( request.getAttribute("model") != null)
  {
	  mbs = (MedicamentBeans)request.getAttribute("model");
  }
  else
  {
	  mbs = new MedicamentBeans();
  }
 %>
 
 <span><span>
 <div>
   <form action="medset" method="post">
   <div id="menu"><h2 id="bv">  Bienvenue : ${sessionScope.log}<br/></h2>
 <h2 id="gm"><center>GESTION DES MEDICAMENTS</center></h2>
   <span id="z"><input type="text" name="recherche" id="btn4"/><button type="submit" id="btn" value="rechercher" name="action" />rechercher</button></span>
   </div>
   </form>
     <br/>
   <fieldset class="f1">
    <legend><h3 class="l1" style="color:#ff9300;text-align:center;border:2px solid #808080;border-radius:20px;background-color:#008040;width:300px;height:30px;">Ajouter un nouveau medicaments</h3> </legend>
<form action="medset" method="post" >
 <table border="1" width="300px">
	 <tr>
 		<td><strong>Nom de médicament :</strong></td>
 		<td><input type="text" name="nom" placeholder=" Le nom ce commencer en majuscule" size="30" maxlength="50" style="border-radius:20px;"/></td>
 	</tr>
 		 <tr>
 		<td><strong>Concentration :</strong></td>
 		<td><input type="text" name="cons" placeholder=" Concentration en mg" size="30" maxlength="50" style="border-radius:20px;"/></td>
 	</tr>
 		 <tr>
 		<td><strong>Description :</strong></td>
 		<td><input type="text" name="des" placeholder=" Description sur ce medicament" size="30" maxlength="50" style="border-radius:20px;"/></td>
 	</tr>	
 	 <tr>
 		<td><strong>Prix :</strong></td>
 		<td><input type="text" name="prix" placeholder=" Prix en DH " size="30" maxlength="50" style="border-radius:20px;"/></td>
 	</tr>
 		 <tr>
 		<td><strong>Date de production :</strong></td>
 		<td><input type="date" name="date_prod" style="border-radius:20px;"/></td>
 	</tr>
 		 <tr>
 		<td><strong>Date de fin :</strong></td>
 		<td><input type="date" name="date_fin" style="border-radius:20px;"/></td>
 	</tr>
 	 	</tr>
    <tr>
 	<td colspan="2" ><center><button type="submit" id="btn" value="Ajouter" style="border-radius:20px;width:100px;"/>Ajouter</button></center></td>
 	</tr>
  </table>
  </form>
 
   </fieldset> 
  
 <fieldset class="f2">
 <legend><h3 class="l2" style="color:#ff9300;
    color:#ff9300;	
	text-align:center;
	border:2px solid #808080;
	border-radius:20px;
	background-color:#008040;
	width:300px;
    height:30px;">La listes des medicament</h3> </legend>
  <table border="2" width="470px">
    <tr>
      <th><strong>Id</strong></th><th><strong>Nom</strong></th><th><strong>Concentration</strong></th><th><strong>Description</strong></th><th><strong>Prix</strong></th><th><strong>Date de production</strong></th><th><strong>Date d'expiration</strong></th>
    </tr>
    <%
       Iterator<Medicament> liste =  mbs.getList().iterator();
       while(liste.hasNext())
       {
    	   Medicament m = liste.next();
      
    %>
    <tr>
        <td><%=m.getId()%></td>
        <td><%=m.getNom()%> </td>
        <td><%=m.getCons() %> </td>
        <td><%=m.getDes() %> </td>
        <td><%=m.getPrix() %> </td>
        <td><%=m.getDate_prod() %> </td>
        <td><%=m.getDate_fin() %> </td>
        <td>
            <form method="post" action="medset">
              <input type="hidden" name="id" value="<%=m.getId() %>" />
              <input type="hidden" name="action" value="supprimer" />
              <center><button type="submit" id="btn1" value="Supprimer"  style="border-radius:20px;"/>Supprimer</button></center>
            </form>
        </td>
    </tr>
    
    <%
       }
    %>
  </table>
   </fieldset>
   
   </div>
</body>
</html>