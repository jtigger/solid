module SearchResults
  module BlogPosts
    extend self
    def present posts
      posts.map do |post| { SearchResults::BlogPost.new post }
    end
  end

  class BlogPost
    def initialize blog_post_model
      @model = blog_post_model
    end

    def byline
      model.read_page_attribute('byline')
    end
    def category
      model.parent_label
    end
    def image_url
      model.reference_image_path
    end
    def label
      model.label
    end
    def link
      model.full_path
    end
    def summary
      model.read_page_attribute('summary')
    end
    def type
      model.pageable_type
    end

    private
    attr_reader :model
  end
end
