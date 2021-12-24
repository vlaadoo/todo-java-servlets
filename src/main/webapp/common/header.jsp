<header>
	<nav class="navbar navbar-expand-md navbar-dark"
		style="background-color: tomato">
		<div>
			Todo List
		</div>

		<ul class="navbar-nav navbar-collapse justify-content-end">
			<li><a href="<%= request.getContextPath() %>/login" class="nav-link">Sign in</a></li>
			<li><a href="<%= request.getContextPath() %>/register" class="nav-link">Sign up</a></li>
		</ul>
	</nav>
</header>