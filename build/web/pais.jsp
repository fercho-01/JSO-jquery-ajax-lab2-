<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Llamadas AJAX a un Servlet usando JQUERY Y JSON</title>

        <script src="http://code.jquery.com/jquery-latest.min.js"></script>

        <script>

            $(document).ready(function () {

                $('#button').click(function () {
                    var objTabla = $(this).parent();

                    var $country = $("select#country").val();
                    var $Pais;

                    $.get('ActionServlet', {countryname: $country}, function (responseJson) {

                        $.each(responseJson, function (indice,nombre) {
                            console.log(nombre)
                            var eachrow = "<tr>"
                                    + "<td>" + nombre.code+"</td>"
                                    + "<td>" + nombre.name+ "</td>"
                                    + "<td>" + nombre.continent+ "</td>"
                                    + "<td>" + nombre.region+ "</td>"
                                    + "<td>" + nombre.population+ "</td>"
                                    + "<td>" + nombre.capital+ "</td>"
                                    + "</tr>";
                            $('#tbody').append(eachrow);
                        });

                    });
                });


                $('#country').change(function (event) {

                    var $country = $("select#country").val();

                    $.get('ActionServlet', {countryname: $country}, function (responseJson) {

                        var $select = $('#states');

                        $select.find('option').remove();

                        $.each(responseJson, function (key, value) {

                            $('<option>').val(key).text(value).appendTo($select);

                        });

                    });

                });

            });

        </script>

    </head>

    <body>

        <h1>Llamadas AJAX a un Servlet usando JQUERY Y JSON</h1>

        Select Country:

        <select id="country">

            <option>Select Country</option>

            <option value="Colombia">Colombia</option>

            <option value="US">US</option>

        </select>

        <br/>

        <br/>

        Select State:

        <select id="states">

            <option>Select State</option>

        </select>

        <input type="button" value="Show Products" name="button" id="button" />
        <table align="center" width="450" border="1">
            <caption>Paises</caption>
            <thead>
                <tr>
                    <td>Code</td>
                    <td>Name</td>
                    <td>Continent</td>
                    <td>Region</td>
                    <td>Population</td>
                    <td>Capital</td>
                </tr>
            </thead>
            <tbody id="tbody">

            </tbody>

        </table>
    </body>

</html> 
