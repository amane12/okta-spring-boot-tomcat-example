job("First-Maven-Project-Via-DSL"){
	description("First maven job generated by DSL on ${new Date()}")

	scm{
		git("https://github.com/amane12/okta-spring-boot-tomcat-example.git", main)
	}

	triggers{
		scm('* * * * *')
	}

	steps{
		maven('clean package', 'pom.xml')
	}

	publishers{
		archiveArtifacts '**/*.war'
	}
}
