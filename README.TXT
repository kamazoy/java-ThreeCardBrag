------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------




We have overriden hashCode because otherwise HashSet would not work properly
(contains uses 'equals' and remove uses 'hashCode')

import java.util.*;
Set<Card>mySet;
mySet = new HashSet<Card>();
mySet.add(kingofdiam1);
mySet.size();
mySet.size()
1   (int)
mySet.contains(kingofdiam1)
true   (boolean)
mySet.contains(kingofdiam2)
true   (boolean)
mySet.remove(kingofdiam1)
true   (boolean)
mySet.size()
0   (int)
