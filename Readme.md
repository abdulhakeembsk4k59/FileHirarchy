<h1>FileName Reader Challenge</h1>

challege: - we have some file names "File1", " File2", "  File3", " File4", "File5" .
suppouse "File1" doesn't have spaces before it is an Parent File
and " File2" having a single space before it so it is an "File1" childe
and "  File3" having two spaces before it's file name  so it is an child of " File2" 
and " File4" having a single space before its file name so it is an "File1" 's child
and "File5" doesn't have any spaces before it so it is an indipendent File.

We have to take input from inputFile.txt
so create a inputFile.txt file
and add this text in it :-

File1 <br>
 &nbsp;File2 <br>
  &nbsp;&nbsp;File3 <br>
 &nbsp;File4 <br>
File5 <br>

so create a java code to find who is the file's parent is  in the given format

Required Output Format :

FileName   &nbsp;&nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; ParentFile<br>
========== &nbsp; ==========<br>
File5 &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp;  null<br>
File4 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;   File1<br>
File3 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;    File2<br>
File2 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;    File1<br>
File1 &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp;   null<br>



if you didn't able to code this challenge then you can consider my code which is in FileNameChallenge.java<br>
if you have any doubts you can ask me through : sk.a.hakeem123@gmail.com<br>
Thankyou for being here :)<br>
Happy coding (:<br>
