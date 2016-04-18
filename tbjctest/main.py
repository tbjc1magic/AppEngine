import os
import urllib
import cgi

from google.appengine.api import users
from google.appengine.ext import ndb

import jinja2
import webapp2

DEFAULT_GUESTBOOK_NAME = 'default_guestbook'

# We set a parent key on the 'Greetings' to ensure that they are all in the same
# entity group. Queries across the single entity group will be consistent.
# However, the write rate should be limited to ~1/second.

JINJA_ENVIRONMENT = jinja2.Environment(
    loader=jinja2.FileSystemLoader(os.path.dirname(__file__)),
    extensions=['jinja2.ext.autoescape'],
    autoescape=True)

class MainPage(webapp2.RequestHandler):

    def get(self):

        template_values = {
            'greetings': "Hello bobo!!!",
        }

        template = JINJA_ENVIRONMENT.get_template('index.html')
        self.response.write(template.render(template_values))

class testor(webapp2.RequestHandler):

    def get(self):

        template_values = {
        }

        template = JINJA_ENVIRONMENT.get_template('testor.html')
        self.response.write(template.render({}))

class DataIncubator(webapp2.RequestHandler):

    def get(self):
        template = JINJA_ENVIRONMENT.get_template('DataIncubator.html')
        self.response.write( template.render({}))

application = webapp2.WSGIApplication([
    (r'/', MainPage),
    ('/Other$',DataIncubator),
    ('/testor$',testor),
], debug=True)
