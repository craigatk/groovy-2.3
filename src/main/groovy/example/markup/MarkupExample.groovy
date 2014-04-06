package example.markup

import groovy.text.Template
import groovy.text.markup.MarkupTemplateEngine
import groovy.text.markup.TemplateConfiguration

/**
 * See docs at http://beta.groovy-lang.org/docs/groovy-2.3.0-SNAPSHOT/html/documentation/markup-template-engine.html
 */
class MarkupExample {
    String markupFromTemplateFile() {
        TemplateConfiguration config = new TemplateConfiguration(
                autoIndent: true,
                autoIndentString: '  ',
                autoNewLine: true
        )
        MarkupTemplateEngine engine = new MarkupTemplateEngine(config)
        Template template = engine.createTemplateByPath("markup.tpl")
        Writable output = template.make()
        StringWriter writer = new StringWriter()
        output.writeTo(writer)

        return writer.toString()
    }
}