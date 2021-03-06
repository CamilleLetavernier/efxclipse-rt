/*
* generated by Xtext
*/
package org.eclipse.fx.code.compensator.hsl.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.fx.code.compensator.hsl.services.HSLGrammarAccess;

public class HSLParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private HSLGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.eclipse.fx.code.compensator.hsl.parser.antlr.internal.InternalHSLParser createParser(XtextTokenStream stream) {
		return new org.eclipse.fx.code.compensator.hsl.parser.antlr.internal.InternalHSLParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public HSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(HSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
