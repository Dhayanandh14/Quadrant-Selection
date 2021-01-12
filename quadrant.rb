x=gets.to_i;
y=gets.to_i;
if (0 <= x && y <= 0) 
  print "4";
elsif (0 >= x && y <= 0) 
  print "3"
elsif (0 <= x && y >= 0) 
  print "1"
else 
  print "2"
end
