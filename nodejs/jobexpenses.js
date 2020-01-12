const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let total = 0;
let n;

rl.on('line', (data) => {

	if (n === undefined) {
		n = parseInt(data);
	} else {
		const arr = data.split(' ');
		for (let i = 0; i < n; i++) {
			total += (parseInt(arr[i]) < 0) ? parseInt(arr[i]) : 0;
		}
		console.log(!!total ? -(total) : 0);
	}
});