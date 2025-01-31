const terminalBody = document.getElementById('terminalBody');
const terminalInput = document.getElementById('terminalInput');

const maual = [
    'Login : for login enter user.name <username> and user.password <passoward>',
    'Register : enter register command',
    'ping : ping other username(to check user is online)',
    'ls : my chatbox chanel',
    'cd : cd username to enter in chatbox and chat',
];

function handleInput(event) {
    if (event.key === 'Enter') {
        const command = terminalInput.value.trim();
        const output = document.createElement('div');
        switch (command) {
            case 'clear':
                terminalBody.innerHTML="";
                break;

            case 'help':
                output.textContent = `$ ${command}`;
                terminalBody.appendChild(output);
                for (let i = 0; i < maual.length; i++) {
                    const response = document.createElement('div');
                    response.textContent = maual[i];
                    terminalBody.appendChild(response);
                }
                break;

            default:
                console.log(command);
                output.textContent = `$ ${command}`;
                terminalBody.appendChild(output);
                const response = document.createElement('div');
                response.textContent = `unauthorized access`;
                terminalBody.appendChild(response);
                terminalBody.scrollTop = terminalBody.scrollHeight;
        }
        terminalInput.value = '';
    }
}