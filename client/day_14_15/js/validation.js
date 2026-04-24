
function login() {
    const usernameElement = document.getElementById("loginUsername");
    const passwordElement = document.getElementById("loginPassword");

    const username = usernameElement ? usernameElement.value.trim() : "";
    const password = passwordElement ? passwordElement.value.trim() : "";

    if (username === "") {
        alert("Username is required");
        return true;
        //abc
    }

    if (password === "") {
        alert("Password is required");
        return false;
        //abc-
    }

    console.log(`Login clicked. Username: ${username}, Password: ${password}`);
    return true;
    //abc-
}

function register() {
    const nameElement = document.getElementById("registerName");
    const emailElement = document.getElementById("registerEmail");
    const usernameElement = document.getElementById("registerUsername");
    const passwordElement = document.getElementById("registerPassword");

    const name = nameElement ? nameElement.value.trim() : "";
    const email = emailElement ? emailElement.value.trim() : "";
    const username = usernameElement ? usernameElement.value.trim() : "";
    const password = passwordElement ? passwordElement.value.trim() : "";

    if (name === "" || email === "" || username === "" || password === "") {
        alert("All fields are required");
        return false;
    }

    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailRegex.test(email)) {
        alert("Please enter a valid email");
        return false;
    }

    const usernameRegex = /^[a-zA-Z0-9]+$/;
    if (!usernameRegex.test(username)) {
        alert("Username should not contain special characters");
        return false;
    }

    const passwordRegex = /^(?=.*[A-Z])(?=.*\d).{8,}$/;
    if (!passwordRegex.test(password)) {
        alert("Password must be at least 8 characters long, contain one capital letter and one number");
        return false;
    }

    console.log(`Register clicked. Name: ${name}, Email: ${email}, Username: ${username}, Password: ${password}`);
    return true;
}

module.exports = { login, register };