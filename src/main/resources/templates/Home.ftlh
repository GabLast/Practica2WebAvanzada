<#include "base.ftlh">
<#macro page_head>
    <#if title?has_content>
        <title>${title}</title>
    </#if>
</#macro>

<#macro page_body>
    <body>
    <div class="container-fluid">

        <div class="container-fluid">
            <div class="row">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-md-1">
                        </div>
<#--                        <div class="col-md-10 me-auto">-->
<#--                           -->
<#--                            <div class="table-responsive" style="height: 600px">                          -->
<#--                                <table class="table table-striped table-hover">-->
<#--                                    <thead class="table-dark text-center">-->
<#--                                    <tr>-->
<#--                                        <th scope="col">Matricula</th>-->
<#--                                        <th scope="col">Nombre</th>-->
<#--                                        <th scope="col">Apellido</th>-->
<#--                                        <th scope="col">Tel&eacute;fono</th>-->
<#--                                        <th scope="col"></th>-->
<#--                                    </tr>-->
<#--                                    </thead>-->
<#--                                    <tbody class="text-center table-bordered">-->
<#--                                    <#if listaEstudiantes?has_content>-->
<#--                                        <#list listaEstudiantes as es>-->
<#--                                            <tr class="table-secondary">-->

<#--                                                <td>${es.getMatricula()?string.computer}</td>-->
<#--                                                <td>${es.getNombre()}</td>-->
<#--                                                <td>${es.getApellido()}</td>-->
<#--                                                <td>${es.getTelefono()}</td>-->
<#--                                                <td>-->
<#--                                                    <div class="row">-->
<#--                                                        <div class="col">-->
<#--                                                            <a href="/edit?matricula=${es.getMatricula()?string.computer}">-->
<#--                                                                <button class="btn btn-sm btn-custom1" type="submit">-->
<#--                                                                    <span class="material-icons">edit</span>-->
<#--                                                                </button>-->
<#--                                                            </a>-->
<#--                                                        </div>-->
<#--                                                        <div class="col">-->
<#--                                                            <form method="post" action="/delete" enctype="application/x-www-form-urlencoded">-->
<#--                                                                <input type="number" name="matricula" value="${es.getMatricula()?string.computer}" hidden/>-->
<#--                                                                <button class="btn btn-sm btn-eliminar"-->
<#--                                                                        type="submit">-->
<#--                                                                    <span class="material-icons">clear</span>-->
<#--                                                                </button>-->
<#--                                                            </form>-->
<#--                                                        </div>-->
<#--                                                    </div>-->
<#--                                                </td>-->
<#--                                            </tr>-->
<#--                                        </#list>-->
<#--                                    <#else>-->
<#--                                        <tr class="table-secondary">-->
<#--                                            <td>No</td>-->
<#--                                            <td>Hay</td>-->
<#--                                            <td>Datos</td>-->
<#--                                            <td>Ingresados</td>-->
<#--                                            <td>Actualmente</td>-->
<#--                                        </tr>-->
<#--                                    </#if>-->
<#--                                    </tbody>-->
<#--                                </table>-->
<#--                            </div>-->
<#--                        </div>-->
                        <div class="col md-1">
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    </body>
</#macro>
<@display_page/>