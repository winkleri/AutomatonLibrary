Author: ***Ilja Winkler***
E-Mail: ***iljawinkler@googlemail.com***
GitHub: ***winkleri***
License: distribution of software ***only*** via the author. ***Not for commercial use!***
Version: ***2025-12-4 Automaton Library***

# Automaton Library in Java ☕
by Ilja 8)

### Preamble
- #### This library was written by me in Java to showcase my application theoretical knowledge and programming/software engineering skill, to improve my portfolio for future job applications/interviews and of course just for fun :-) 
- #### I know my implementation is not perfect (yet...), if there is even such a thing as aa perfect implementation
- #### Important things to keep in mind when reading this code: I am still learning how to code (especially best practices), I am maintaining this project in my free time next to studying my undergraduate computer science degree and working part-time.
- #### I chose Java for this project simply because I am most experienced in it and my motto is to perfect one skill before I move to the next
- #### In case you find any typos in this material just issue a pull request or mail me ^^ 

## Documentation | Implementation
### Below I listed my reasoning for structuring the project with a focus on software engineering and design choices.

#### _This may be subject to change!_ 

- Test-driven development of program functionalities using JUnit5
- Each method in this project has its own java doc comment and depending on the magnitude of implementation also comments inside of it explaining the
logic of more complex subprocesses or ones that are relevant to understanding the machinations and coherence of that block
- An exception to this rule is boilerplate that is obvious such as (default) accessors/mutators or constructors. I assume the person reading this is smart enough to piece this together without having to state outrightly every single line of code
- Every class features a comment linking to the author of that class (me in most, if not all, cases) and contact info regarding author or other helpful information such as pieces of code I read up online before writing class (i.e. StackOverlow discussions)
- Naming of variables, methods and classes (amongst other things) is according to Java conventions