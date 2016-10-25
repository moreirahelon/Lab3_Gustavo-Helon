package Ex_5;

public class LanguageChooser {
	String _language;
	LetterFieldsFactory _factory;
	LetterBuilder _builder;
	LanguageChooser(LetterFieldsFactory factory,LetterBuilder builder){
		_builder = builder;
		_factory = factory;
		_language = "english";
	}
	public void setLanguage(String language){
		_factory.setLanguage(language);
		_builder.setLanguage(language);
	}

}
