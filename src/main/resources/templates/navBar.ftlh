<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="/">
            <#if inicio??>
                ${inicio}
            </#if>
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" style="margin-top: 5px;" id="navbarNav">
            <span class="navbar-text">
                <#if welcome??>
                    ${welcome}
                </#if>
            </span>
            <ul class="navbar-nav ms-auto">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button"
                       data-bs-toggle="dropdown" aria-expanded="false">
                        <#if gestionmocks??>
                            ${gestionmocks}
                        </#if>
                    </a>
                    <ul class="dropdown-menu bg-light" aria-labelledby="navbarDropdownMenuLink">
                        <li><a class="dropdown-item" href="/mock/manage">
                                <#if viewMocks??>
                                    ${viewMocks}
                                </#if>
                            </a></li>
                        <li><a class="dropdown-item" href="/mock/create">
                                <#if crearMock??>
                                    ${crearMock}
                                </#if>
                            </a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>