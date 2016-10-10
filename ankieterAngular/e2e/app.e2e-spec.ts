import { AnkieterAngularPage } from './app.po';

describe('ankieter-angular App', function() {
  let page: AnkieterAngularPage;

  beforeEach(() => {
    page = new AnkieterAngularPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
