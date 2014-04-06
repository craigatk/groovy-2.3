package example.markup

import spock.lang.Specification

class MarkupExampleSpec extends Specification {
    def 'should render markup from template file'() {
        when:
        String templateText = new MarkupExample().markupFromTemplateFile()

        then:
        assert templateText == '''<html>
  <head>
    <title>Markup Page</title>
  </head><body>
    <div>
      <h1>My First Markup Page</h1>
    </div>
  </body>
</html>'''
    }
}
