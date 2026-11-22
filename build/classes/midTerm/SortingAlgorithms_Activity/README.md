# Documentation



## Briefly explain what your Java program does.



Ang akong Java Program na SortingAlgorithms.java kay gina-sort niya ang number from smallest to largest nga pa accending order gamit ang 3 ka sorting algorithm which is ang Bubble Sort, Selection Sort ug ang Insertion sort. Naka separate class ang lahi-lahi nga sorting algorithm pero same lng na numbers ang akong gamiton and also with the same result kung gi-unsa pag sort sa lahi-lahi nga sorting algorithm.



## Bubble Sort

Ang akong pag sabot kay sa outer loop kay siya ang mag control sa mga niagi nga mga loop para dile na balikon ang na sort nga index. Kay if mahuman ang loop sa inner loop kay ma sort naman ang pinaka dako nga number. So after that, ang size sa index kay ma minus 1 siya para dile na mahilabtan ang largest number na na sorted na.Sa inner loop dayun ang iyang purpose is to swap values. Iyang i compare kung mas dako ba ang left kaysa right value. If true ang condition mag swap siya. Mag himo siyag temporary variable then iya i hold ang left value then ang ang left value ilisdan sa right value unya ang right value pud dayun i overwrite niya ang value sa temporary variable. If False pud ang condition kay iya rang lakturan then pag proceed sa next index(ex. index: 0 "if false ang condition" mu ditso na siya sa index: 1 then compare nasad niya ang value next index kay nag +1 man sa "numbers\[j + 1]") and mag padayun lngdayun iyang looping hantud sa ma sort na tanan values sa numbers\[].



## Selection Sort

Basically agi-an niya ang tanan index then if makakita siyag pina ka gamay, iyaha dayung i swap sa current index nga pulihan. Sa outer loop same lng gyapon siya ang ga control sa loop. then sulod sa outer loop naa dayun nag declare tag minimum index para pag makakita tag mas gamay na number sa atong gi compare na index value atong i swap. Sa inner loop naa diri atong condition nga kung mag compare. Ang value nga atong i compare sa left side sa condition is ang array\[j] (numbers\[j] < numbers\[minIndex]) if ma true ni siya i overwrite niya ang value sa "minIndex" into value of "j" (minIndex = j), dayun moo loop paman ta, agian na niya tanan value sa index kung asa pay mas gamay sa current minIndex the overwrite napud dayun. After ma determine and ma mark and minIndex ang buhaton is mugawas siya sa inner loop and mag swapping nata. Naa napud tay (int temp = numbers\[i]),since zero pa ang "i" katong first value sa index ang atong pulihan. Ang mahitabo kay i hold ni (int temp) ang value sa "index 0" then and "index 0" pulihan niya into the value of minIndex which is katong nakit-an nga mas-gamay sa current "index 0". After that kay mag-loop napud tas sa outer-loop and run napud ang inner loop and so on.



## Insertion Sort

Sa situation sa Insertion wra rakag gadula ug cards. Sa outer loop same lng gyapon ga control siya sa loop. Then sulod sa outer loop naay (int key = numbers\[i]) siya ang mag hold sa value nga i swap.  Sa inner loop kay gina check niya if mas gamay ang value sa gina insert nga number sa left side number then mu-stop ang inner loop hantod makita na niya ang iyang correct position then balik sa outer loop ang so on.



## Differences

Ang kalahian nilang tulo kay ang "Bubble Sort" kay ginagamit lng siya for gagmay kaayu nga mga dataset, ang "Selection sort" kay para sa "gagmay lng gyud nga swaps nga needed" and lastly "Insertion" is para sa hapit na ma sort nga datasets.





**How does each sorting algorithm arrange numbers? What makes their processes different?**

* Ang bubble sort kay mag compare ang mag-apad nga number then kung kinsay mas dako siyay ibutang sa pinaka ulahi, sa Selection kay mangita siyag pinaka-gamay nga number then ibutang sa pinaka-unahan and ang Insertion Sort magkuha siyag number ug isulod sa saktong pwesto. Lahi-lahi gyud ang ilang pamaagi.



**Among the three sorting algorithms, which one do you think is the easiest to understand and implement? Why?**

* Ang Bubble Sort, kay simple lng iyang pamaagi. Compare lng, kung kinsay mas dako ibutang sa right side.



**If the numbers are already sorted, which algorithm do you think would perform better? Explain your answer based on how the algorithms work.**

* Ang Bubble sort ug ang Insertion sort sa Bubble kay muhunod dayun kung wlay ilisan.



**What will happen if you add more numbers to your array? How might this affect the performance of each sorting algorithm?**

* Yes, kay mas mu-anam ug kadako ang size sa array kay mas daghan mang ang i sort maong maka apekto gyud labi na time.



**As a future programmer, why is it important to understand different sorting algorithms instead of using just one?**

* Kay para ma identify kung unsay best gamiton nga sorting algorithm ug makahimo ug paspas nga system or program.

