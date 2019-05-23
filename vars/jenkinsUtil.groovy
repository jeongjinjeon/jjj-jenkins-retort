
def jenkinsLog = {text, color -> 
    switch(color) { 
		   case 'red': 
				ansiColor('jenkins-system-log') {
					echo '\u001B[31;49m'+text+'\u001B[m'
				}    
				break
		   case 'yellow': 
				ansiColor('jenkins-system-log') {
					echo '\u001B[31;33m'+text+'\u001B[m'
				}    
				break
			case 'green': 
				ansiColor('jenkins-system-log') {
					echo '\u001B[31;32m'+text+'\u001B[m'
				}    
				break    
			default: 
				ansiColor('jenkins-system-log') {
					echo '\u001B[31;49m'+text+'\u001B[m'
				}    
				break
        }
}

def colorLog (text, color ){
    switch(color) { 
		   case 'red': 
				ansiColor('jenkins-system-log') {
					echo '\u001B[31;49m'+text+'\u001B[m'
				}    
				break
		   case 'yellow': 
				ansiColor('jenkins-system-log') {
					echo '\u001B[31;33m'+text+'\u001B[m'
				}    
				break
			case 'green': 
				ansiColor('jenkins-system-log') {
					echo '\u001B[31;32m'+text+'\u001B[m'
				}    
				break    
			default: 
				ansiColor('jenkins-system-log') {
					echo '\u001B[31;49m'+text+'\u001B[m'
				}    
				break
        }
}

def nomalLog (text, color ){
	echo 'test'
}