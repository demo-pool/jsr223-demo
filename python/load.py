## import modules and helper functions
import tenjin
import sys
#tenjin.set_template_encoding('cp932')   # template encoding
from tenjin.helpers import *

print sys.path
## context data
context = {
    'title': 'Tenjin Example',
    'items': ['<AAA>', 'B&B', '"CCC"'],
}

## create engine object
engine = tenjin.Engine(path=['views'])

## render template with context data
html = engine.render('page.pyhtml', context)
print(html)
