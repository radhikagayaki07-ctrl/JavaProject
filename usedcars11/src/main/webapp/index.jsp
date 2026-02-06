<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Login | Used Cars Admin</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" />
    <!-- Bootstrap Icons -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css" rel="stylesheet" />

    <style>
        body {
            background: linear-gradient(135deg, #667eea, #764ba2);
            min-height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            padding: 20px;
        }
        .login-card {
            background: linear-gradient(135deg, #ffffff, #f3e5f5);
            border-radius: 25px;
            padding: 40px;
            box-shadow: 0 12px 30px rgba(0,0,0,0.25);
            max-width: 420px;
            width: 100%;
        }
        .login-icon {
            font-size: 3.5rem;
            color: #6f42c1;
        }
        .form-control {
            border-radius: 12px;
        }
        .btn-login {
            background: linear-gradient(45deg, #36d1dc, #5b86e5);
            border: none;
            color: white;
            font-weight: 600;
        }
        .btn-login:hover {
            transform: scale(1.02);
            transition: 0.3s;
        }
    </style>
</head>
<body>

<div class="login-card text-center">
    <i class="bi bi-car-front-fill login-icon"></i>
    <h3 class="mt-3 fw-bold text-primary">Admin Login</h3>
    <p class="text-muted mb-4">Used Cars Management System</p>

     <form action="/login" method="post">
        <!-- Username -->
        <div class="mb-3 text-start">
            <label class="form-label">Username</label>
            <input type="text" class="form-control" name="username" placeholder="Enter username" required autocomplete="off" />
        </div>

        <!-- Password -->
        <div class="mb-3 text-start">
            <label class="form-label">Password</label>
            <input type="password" class="form-control" name="password" placeholder="Enter password" required autocomplete="off" />
        </div>

        <div class="d-grid mt-4">
            <button type="submit" class="btn btn-login btn-lg">
                <i class="bi bi-box-arrow-in-right"></i> Login
            </button>
        </div>
    </form>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
    